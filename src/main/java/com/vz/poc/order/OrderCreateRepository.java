package com.vz.poc.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderCreateRepository extends JpaRepository<OrderCreate, Long> {

}
