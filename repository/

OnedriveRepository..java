

import org.springframework.data.repository.CrudRepository;

public interface OnedriveRepository extends CrudRepository<Onedrive, Long> {
 
    Onedrive findByUsername(String username);
    Onedrive findByPassword(String password);
    Onedrive findByUrl(String url);
    Onedrive findByRepositoryName(String repositoryName);
    List<Onedrive> findByTitle(String title);
    List<Onedrive> findByUserNameAndUrlAndAction(String userName, String url, String action);
    List<Onedrive> findByEntriesToDisplay(int entriesToDisplay);
    List<Onedrive> findByPageNumber(int pageNumber);
    
    void saveOnedrive(Onedrive onedrive);
    void deleteOnedrive(Onedrive onedrive);
    void deleteByUsername(String username);
    void deleteByPassword(String password);
    void deleteByUrl(String url);
    void deleteByRepositoryName(String repositoryName);
    
    boolean validateCredentials(String username, String password, String url, String repositoryName);
}