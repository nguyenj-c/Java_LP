package Bibliotheque;

public class book {
	private String title;
	private String author;
	private String editor;
	private String pageNb;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getPageNb() {
		return pageNb;
	}

	public void setPageNb(String pageNb) {
		this.pageNb = pageNb;
	}

	public book(String title, String author, String editor, String pageNb) {
		super();
		this.title = title;
		this.author = author;
		this.editor = editor;
		this.pageNb = pageNb;
	}

	@Override
	public String toString() {
		return "book [title=" + title + ", author=" + author + ", editor=" + editor + ", pageNb=" + pageNb + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((editor == null) ? 0 : editor.hashCode());
		result = prime * result + ((pageNb == null) ? 0 : pageNb.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		book other = (book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (editor == null) {
			if (other.editor != null)
				return false;
		} else if (!editor.equals(other.editor))
			return false;
		if (pageNb == null) {
			if (other.pageNb != null)
				return false;
		} else if (!pageNb.equals(other.pageNb))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
