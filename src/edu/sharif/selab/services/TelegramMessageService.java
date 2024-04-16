package edu.sharif.selab.services;

import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.TelegramMessage;

public class TelegramMessageService implements MessageService {
    @Override
    public void sendMessage(Message message) {
        if (message instanceof TelegramMessage telegramMessage) {
            System.out.println("Sending a Telegram Message from " + telegramMessage.getSourceTelegramId() + " to " + telegramMessage.getTargetTelegramId() + " with content : " + telegramMessage.getContent());
        }
    }
}
