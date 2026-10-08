package nr;

import java.util.ArrayList;
import java.util.List;
import mr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\"(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"$\u0010\u000b\u001a\u0004\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0006\u001a\u0004\b\b\u0010\t\"(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"Lmr/b;", "", "Lmr/k;", "a", "(Lmr/b;)Ljava/util/List;", "getContextParameters$annotations", "(Lmr/b;)V", "contextParameters", "b", "(Lmr/b;)Lmr/k;", "getExtensionReceiverParameter$annotations", "extensionReceiverParameter", "c", "getValueParameters$annotations", "valueParameters", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final List<k> a(mr.b<?> bVar) {
        List<k> parameters = bVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((k) obj).k() == k.a.CONTEXT) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final k b(mr.b<?> bVar) {
        Object obj = null;
        boolean z15 = false;
        Object obj2 = null;
        for (Object obj3 : bVar.getParameters()) {
            if (((k) obj3).k() == k.a.EXTENSION_RECEIVER) {
                if (z15) {
                    return (k) obj;
                }
                z15 = true;
                obj2 = obj3;
            }
        }
        if (z15) {
            obj = obj2;
        }
        return (k) obj;
    }

    public static final List<k> c(mr.b<?> bVar) {
        List<k> parameters = bVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((k) obj).k() == k.a.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
