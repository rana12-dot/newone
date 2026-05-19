package com.stubserver.backend.repository;

import com.stubserver.backend.entity.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {

    Optional<AuditLog> findFirstByActionTypeInOrderByTimestampDesc(Collection<String> actionTypes);
}
