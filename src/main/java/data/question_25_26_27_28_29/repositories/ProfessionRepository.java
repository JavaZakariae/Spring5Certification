package data.question_25_26_27_28_29.repositories;

import data.commun.Profession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession, Integer> {

}
