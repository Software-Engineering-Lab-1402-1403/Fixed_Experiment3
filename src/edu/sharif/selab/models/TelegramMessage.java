package edu.sharif.selab.models;

public class TelegramMessage implements Message {
    private String content;
    private String sourceTelegramId;
    private String targetTelegramId;

    public String getSourceTelegramId() {
        return sourceTelegramId;
    }

    public String getTargetTelegramId() {
        return targetTelegramId;
    }

    public void setSourceTelegramId(String sourceTelegramId) {
        this.sourceTelegramId = sourceTelegramId;
    }

    public void setTargetTelegramId(String targetTelegramId) {
        this.targetTelegramId = targetTelegramId;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }
}
