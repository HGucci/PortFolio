package com.mycompany.project.board.model;

public class noticeBoardPageMakerDTO {

	/* ?? ??ด์ง? */
    private int startPage;
    
    /* ? ??ด์ง? */
    private int endPage;
    
    /* ?ด?  ??ด์ง?, ?ค? ??ด์ง? ์กด์ฌ? ๋ฌ? */
    private boolean prev, next;
    
    /*? ์ฒ? ๊ฒ์๋ฌ? ?*/
    private int total;
    
    /* ??ฌ ??ด์ง?, ??ด์ง??น ๊ฒ์๋ฌ? ??? ? ๋ณ? */
    private noticeCriteria cri;

    public noticeBoardPageMakerDTO(noticeCriteria cri, int total) {
        
        this.cri = cri;
        this.total = total;
        
        /* ๋ง์?๋ง? ??ด์ง? */
        this.endPage = (int)(Math.ceil(cri.getPageNum()/10.0))*10;
        /* ?? ??ด์ง? */
        this.startPage = this.endPage - 9;
        
        /* ? ์ฒ? ๋ง์?๋ง? ??ด์ง? */
        int realEnd = (int)(Math.ceil(total * 1.0/cri.getAmount()));
        
        if(realEnd < this.endPage) {
            this.endPage = realEnd;
        }
        
        /* ?? ??ด์ง?(startPage)๊ฐ์ด 1๋ณด๋ค ?ฐ ๊ฒฝ์ฐ true */
        this.prev = this.startPage > 1;
        
        /* ๋ง์?๋ง? ??ด์ง?(endPage)๊ฐ์ด 1๋ณด๋ค ?ฐ ๊ฒฝ์ฐ true */
        this.next = this.endPage < realEnd;
        
    }

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public noticeCriteria getCri() {
		return cri;
	}

	public void setCri(noticeCriteria cri) {
		this.cri = cri;
	}

	@Override
	public String toString() {
		return "noticeBoardPageMakerDTO [startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next="
				+ next + ", total=" + total + ", cri=" + cri + "]";
	}


	
	
	
}
