package bi3;

import dx.b;
import dx.i;
import java.util.List;
import mu.g;
import o04.c;
import oq.i0;
import p071kotlin.Metadata;
import sv0.ProcessId;
import sv0.Uploader;
import tq.e;
import tv0.YourDetails;
import wx.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0012\u0010\nR \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001a0\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!À\u0006\u0003"}, d2 = {"Lbi3/a;", "", "Lsv0/q0;", "fileImageConfiguration", "Loq/i0;", "x1", "(Lsv0/q0;Ltq/e;)Ljava/lang/Object;", "Lo04/c;", "photo", "a3", "(Lo04/c;Ltq/e;)Ljava/lang/Object;", "Lwx/k$a;", "", "originalName", "originalUri", "g8", "(Lwx/k$a;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ltv0/b$a;", "y6", "Ldx/i;", "Ldx/b;", "Lsv0/y;", "e", "()Ldx/i;", "processId", "Lmu/g;", "", "G3", "()Lmu/g;", "vehiclePhotos", "C1", "()Ljava/util/List;", "currentVehiclePhotos", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    List<YourDetails.Photo> C1();

    g<List<YourDetails.Photo>> G3();

    Object a3(c cVar, e<? super i0> eVar);

    i<b, ProcessId> e();

    Object g8(k.Image image, String str, String str2, e<? super i0> eVar);

    Object x1(Uploader uploader, e<? super i0> eVar);

    Object y6(c cVar, e<? super YourDetails.Photo> eVar);
}
