package org.ebookdroid.core.codec;

import org.ebookdroid.core.OutlineLink;
import org.ebookdroid.core.PageLink;

import java.util.List;

public interface CodecDocument {

    CodecPage getPage(int pageNumber);

    int getPageCount();

    List<OutlineLink> getOutline();

    List<PageLink> getPageLinks(int pageNuber);

    void recycle();

    CodecPageInfo getPageInfo(int pageIndex, CodecContext codecContext);
}
