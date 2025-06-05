package io.bootify.live_auction.repos;

import io.bootify.live_auction.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Integer> {
}
