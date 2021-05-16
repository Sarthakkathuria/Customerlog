package io.library.starter.LibraryController;

import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<LogModel,String>{
    @Query("SELECT l from LogModel l where l.date=?1")
	public List<LogModel> findbydate(String date);
	
	@Query("SELECT l from LogModel l where l.name=?1 AND l.logType=?2")
	public List<LogModel> findByCheckIn(String name,String logtype);
}
