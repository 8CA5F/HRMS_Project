package com.emin.hrms.business.abstracts;

import com.emin.hrms.core.utilities.results.DataResult;
import com.emin.hrms.core.utilities.results.Result;
import com.emin.hrms.entities.concretes.JobAdvert;
import com.emin.hrms.entities.dtos.addDtos.JobAdvertAddDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface JobAdvertService {

    DataResult<List<JobAdvert>> getJobAdverts();

    Result addJobAdvert(JobAdvertAddDto jobAdvertsAddDto);

    DataResult<List<JobAdvert>> getActiveJobAdverts();

    DataResult<List<JobAdvert>> getAllByIsActiveTrue(boolean isDesc);

    DataResult<List<JobAdvert>> getActiveJobAdvertsForEmployer(String companyName);

    DataResult<List<JobAdvert>> getJobAdvertByIsActiveTrueAndIsConfirmedTrueAndPageableAsc( int pageNo, int pageSize);

    DataResult<List<JobAdvert>> getJobAdvertByIsActiveTrueAndIsConfirmedTrueAndPageableDesc(int pageNo, int pageSize);

    Result changeActiveJobAdvert(int jobAdvertId, boolean state);

    Result changeConfirmedJobAdvert(int jobAdvertId, boolean state);

    DataResult<JobAdvert> getJobAdvertById(int id);

    Result deleteJobAdvertById(int id);

    DataResult countActiveAndConfirmedByEmployerId(int id);

    DataResult countAllActiveAndConfirmed();

    DataResult<List<JobAdvert>> getJobAdvertByIsActiveTrueAndIsConfirmedTrueAndEmployer_Id(int id);

    DataResult<List<JobAdvert>> getJobAdvertByIsActiveTrueAndIsConfirmedTruePageable(int pageNo, int pageSize);

}
