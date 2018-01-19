package exams.repository;

import exams.domain.IStatistic;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<IStatistic, ObjectId> {
}