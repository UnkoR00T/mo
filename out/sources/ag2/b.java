package ag2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import tq0.BEOrderDocumentResponse;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Ltq0/i$a;", "Lqx3/a;", "a", "(Ljava/util/List;)Ljava/util/List;", "landregistry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6283a;

        static {
            int[] iArr = new int[BEOrderDocumentResponse.a.values().length];
            try {
                iArr[BEOrderDocumentResponse.a.BLIK_T6_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BEOrderDocumentResponse.a.BLIK_ONE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BEOrderDocumentResponse.a.CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BEOrderDocumentResponse.a.WALLET_GP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BEOrderDocumentResponse.a.WALLET_AP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BEOrderDocumentResponse.a.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f6283a = iArr;
        }
    }

    public static final List<qx3.a> a(List<? extends BEOrderDocumentResponse.a> list) {
        qx3.a aVar;
        List<? extends BEOrderDocumentResponse.a> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            switch (a.f6283a[((BEOrderDocumentResponse.a) it.next()).ordinal()]) {
                case 1:
                    aVar = qx3.a.BLIK_T6_CODE;
                    break;
                case 2:
                    aVar = qx3.a.BLIK_ONE_CLICK;
                    break;
                case 3:
                    aVar = qx3.a.CARD;
                    break;
                case 4:
                    aVar = qx3.a.WALLET_GP;
                    break;
                case 5:
                case 6:
                    aVar = qx3.a.UNKNOWN;
                    break;
                default:
                    throw new p();
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
