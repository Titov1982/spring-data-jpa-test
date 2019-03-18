package ru.tai.service;

import org.springframework.stereotype.Service;
import ru.tai.model.Message;
import ru.tai.model.User;

import java.util.Date;
import java.util.List;

@Service("messageService")
public interface MessageService {

    List<Message> findByUser(User user);

    List<Message> findAllByDatetimeBetween(Date start, Date stop);

    void deleteById(Long id);
}
