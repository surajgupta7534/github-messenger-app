package com.suraj.messenger.folders;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface FolderRepository extends CassandraRepository<Folder, String>{

}
