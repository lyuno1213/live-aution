package io.bootify.live_auction.repos;

import io.bootify.live_auction.domain.Auction;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuctionRepository extends JpaRepository<Auction, Integer> {
}
