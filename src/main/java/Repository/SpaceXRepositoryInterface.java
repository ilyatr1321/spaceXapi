package Repository;

import Entity.SpaceXCapsules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceXRepositoryInterface extends JpaRepository<SpaceXCapsules, String> {
}
