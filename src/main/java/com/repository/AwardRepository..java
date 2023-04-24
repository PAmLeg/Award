import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AwardRepository extends JpaRepository<Award, Long> {
   // custom methods here
}
