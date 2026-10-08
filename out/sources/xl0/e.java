package xl0;

import al0.BEFileInfo;
import gm0.FileInfoDto;
import gm0.e2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0002*\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "Lal0/l;", "Lgm0/c2;", "c", "(Ljava/util/List;)Ljava/util/List;", "a", "(Lal0/l;)Lgm0/c2;", "Lal0/l$a;", "Lgm0/e2;", "b", "(Lal0/l$a;)Lgm0/e2;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f219284a;

        static {
            int[] iArr = new int[BEFileInfo.a.values().length];
            try {
                iArr[BEFileInfo.a.Photo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BEFileInfo.a.Attachment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f219284a = iArr;
        }
    }

    private static final FileInfoDto a(BEFileInfo bEFileInfo) {
        return new FileInfoDto(bEFileInfo.getId(), bEFileInfo.getName(), b(bEFileInfo.getType()));
    }

    public static final e2 b(BEFileInfo.a aVar) {
        int i15 = a.f219284a[aVar.ordinal()];
        if (i15 == 1) {
            return e2.PHOTO;
        }
        if (i15 == 2) {
            return e2.ATTACHMENT;
        }
        throw new p();
    }

    public static final List<FileInfoDto> c(List<BEFileInfo> list) {
        List<BEFileInfo> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((BEFileInfo) it.next()));
        }
        return arrayList;
    }
}
