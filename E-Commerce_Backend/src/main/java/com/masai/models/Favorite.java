package com.masai.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Favorites")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Favorite {
	@Id
	private String favoriteId;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Column(name = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "favorite", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<FavoriteItem> favoriteItems;
}
