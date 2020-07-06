package org.wcci.apimastery;

import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
    Album findAlbumByTitle (String title);
}
