package re2;

import java.util.List;
import p071kotlin.Metadata;
import zd2.ImageAttachments;
import zd2.Photo;
import zp0.BEReportIncidentTypes;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u000e0\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lre2/g;", "", "Lwx/i$a;", "file", "Lzd2/b;", "attachments", "Loq/i0;", "i6", "(Lwx/i$a;Lzd2/b;)V", "Lmu/g;", "", "Lzd2/d;", "V1", "()Lmu/g;", "Loq/r;", "c0", "()Ljava/util/List;", "Lo04/c;", "thumbnail", "s7", "(Lo04/c;)V", "l0", "(Lo04/c;)Loq/r;", "Lzp0/n;", "response", "k3", "(Lzp0/n;)V", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {
    mu.g<List<Photo>> V1();

    List<oq.r<Photo, ImageAttachments>> c0();

    void i6(wx.i.Image file, ImageAttachments attachments);

    void k3(BEReportIncidentTypes response);

    oq.r<Photo, ImageAttachments> l0(o04.c thumbnail);

    void s7(o04.c thumbnail);
}
