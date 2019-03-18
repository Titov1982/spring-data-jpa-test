package ru.tai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tai.model.Message;
import ru.tai.model.User;
import ru.tai.repository.MessageRepository;

import java.util.List;
import java.util.Optional;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Message> findByUser(User user) {
        List<Message> messages = messageRepository.findByUser(user);
        return messages;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Optional<Message> message = messageRepository.findById(id);
        message.get().setUser(null);
        messageRepository.delete(message.get());
    }
}
