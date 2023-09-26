package com.exemplar.arete.persistence.user;

import com.exemplar.arete.domain.users.User;
import com.exemplar.arete.domain.users.ports.UserDatabasePorts;

public class UserDatabaseAdapter implements UserDatabasePorts {

    @Override
    public User getUser(String username) {
        return null;
    }
//    @Override
//    public Set<ConsumptionEstimate> getConsumptionEstimatesForPlan(Long planId) {
//        List<UnitConsumptionEstimateEntity> estimateList = unitConsumptionEstimateRepository.findAllByPlanId(planId);
//        return estimateList.stream().map(estimateEntityMapper::getModelFromEntity).collect(Collectors.toSet());
//    }
}

