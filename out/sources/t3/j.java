package t3;

import fr.t;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Lt3/j;", "", "<init>", "()V", "", "pathData", "Ljava/util/ArrayList;", "Lt3/h;", "Lkotlin/collections/ArrayList;", "nodes", "a", "(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;", "", "[F", "nodeData", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float[] nodeData = new float[64];

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList b(j jVar, String str, ArrayList arrayList, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return jVar.a(str, arrayList);
    }

    public final ArrayList<h> a(String pathData, ArrayList<h> nodes) {
        int i15;
        char cCharAt;
        float fIntBitsToFloat;
        int length = pathData.length();
        int i16 = 0;
        while (i16 < length && t.d(pathData.charAt(i16), 32) <= 0) {
            i16++;
        }
        while (length > i16 && t.d(pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i17 = 0;
        while (i16 < length) {
            while (true) {
                i15 = i16 + 1;
                cCharAt = pathData.charAt(i16);
                int i18 = cCharAt | ' ';
                if ((i18 - 97) * (i18 - 122) <= 0 && i18 != 101) {
                    break;
                }
                if (i15 >= length) {
                    cCharAt = 0;
                    break;
                }
                i16 = i15;
            }
            if (cCharAt != 0) {
                int i19 = cCharAt | ' ';
                if (i19 != 122) {
                    while (i15 < length && t.d(pathData.charAt(i15), 32) <= 0) {
                        i15++;
                    }
                    boolean z15 = i19 == 97;
                    int i25 = 0;
                    do {
                        long jA = (!z15 || 3 > i25 || i25 >= 5) ? b.a(pathData, i15, length) : b.a(pathData, i15, Math.min(i15 + 1, length));
                        i15 = (int) (jA >>> 32);
                        fIntBitsToFloat = Float.intBitsToFloat((int) (jA & BodyPartID.bodyIdMax));
                        if (!Float.isNaN(fIntBitsToFloat)) {
                            float[] fArr = this.nodeData;
                            int i26 = i25 + 1;
                            fArr[i25] = fIntBitsToFloat;
                            if (i26 >= fArr.length) {
                                float[] fArr2 = new float[i26 * 2];
                                this.nodeData = fArr2;
                                pq.n.k(fArr, fArr2, 0, 0, fArr.length);
                            }
                            i25 = i26;
                        }
                        while (i15 < length && (t.d(pathData.charAt(i15), 32) <= 0 || pathData.charAt(i15) == ',')) {
                            i15++;
                        }
                        if (i15 >= length) {
                            break;
                        }
                    } while (!Float.isNaN(fIntBitsToFloat));
                    i17 = i25;
                }
                i.a(cCharAt, nodes, this.nodeData, i17);
            }
            i16 = i15;
        }
        return nodes;
    }
}
