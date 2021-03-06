package com.company.example.article;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.leopard.jdbc.Jdbc;

@Repository
public class ArticleDaoMysqlImpl implements ArticleDao {

	@Autowired
	private Jdbc jdbc;

	@Override
	public boolean add(Article article) {
		return jdbc.insert("article", article);
	}

	@Override
	public Article get(String articleId) {
		String sql = "select * from article where articleId=? and deleted=0;";
		return jdbc.query(sql, Article.class, articleId);
	}

	@Override
	public boolean delete(String articleId, long opuid, Date lmodify) {
		String sql = "update article set deleted=1,lmodify=? where articleId=?;";
		return jdbc.updateForBoolean(sql, lmodify, articleId);
	}

}
