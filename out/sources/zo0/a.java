package zo0;

import ap0.FileUploadResponse;
import fv.e0;
import fv.y;
import ge4.x;
import ie4.f;
import ie4.i;
import ie4.l;
import ie4.o;
import ie4.q;
import ie4.s;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lzo0/a;", "", "", "path", "authorization", "Lfv/y$c;", "file", "Lge4/x;", "Lap0/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Lfv/y$c;Ltq/e;)Ljava/lang/Object;", "Lfv/e0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "fileservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @l
    @o("{path}")
    Object a(@s(encoded = true, value = "path") String str, @i("Authorization") String str2, @q y.c cVar, e<? super x<FileUploadResponse>> eVar);

    @f("{path}")
    Object b(@s(encoded = true, value = "path") String str, @i("Authorization") String str2, e<? super x<e0>> eVar);
}
