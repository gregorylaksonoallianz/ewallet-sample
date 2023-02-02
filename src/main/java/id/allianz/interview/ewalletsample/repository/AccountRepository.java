package id.allianz.interview.ewalletsample.repository;

import id.allianz.interview.ewalletsample.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
