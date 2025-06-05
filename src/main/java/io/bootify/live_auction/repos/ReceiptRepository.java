package io.bootify.live_auction.repos;

import io.bootify.live_auction.domain.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {
}
