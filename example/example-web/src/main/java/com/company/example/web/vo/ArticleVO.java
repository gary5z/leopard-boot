package com.company.example.web.vo;

import java.util.Date;

import com.company.example.serializer.NicknameJsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 文章
 * 
 * @author 谭海潮
 *
 */
public class ArticleVO {

	/**
	 * 文章ID
	 */
	private String articleId;

	/**
	 * 用户ID
	 */
	@JsonSerialize(using = NicknameJsonSerializer.class)
	private long uid;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 发表时间
	 */
	private Date posttime;

	/**
	 * 最后修改时间
	 */
	private Date lmodify;

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPosttime() {
		return posttime;
	}

	public void setPosttime(Date posttime) {
		this.posttime = posttime;
	}

	public Date getLmodify() {
		return lmodify;
	}

	public void setLmodify(Date lmodify) {
		this.lmodify = lmodify;
	}
}
