package ru.tai.service;

import org.springframework.stereotype.Service;
import ru.tai.model.Message;
import ru.tai.model.User;

import java.util.List;

@Service("messageService")
public interface MessageService {

    List<Message> findByUser(User user);

    void deleteById(Long id);
}
