package com.example.security.services;

import com.example.security.model.AuditLog;
import com.example.security.model.Note;

import java.util.List;

public interface AuditLogService {

    void logNoteCreation(String username, Note note);
    void logNoteUpdate(String username, Note note);
    void logNoteDelete(String username, Long noteId);
    List<AuditLog> getAllAuditLogs();
    List<AuditLog> getAuditLogsForNoteId(Long noteId);
}
