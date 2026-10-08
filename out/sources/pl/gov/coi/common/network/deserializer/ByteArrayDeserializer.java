package pl.gov.coi.common.network.deserializer;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import fu.d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import n00.a;
import p071kotlin.Metadata;
import pq.v;
import vv.h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpl/gov/coi/common/network/deserializer/ByteArrayDeserializer;", "Lcom/google/gson/k;", "", "<init>", "()V", "Lcom/google/gson/l;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/j;", "context", "b", "(Lcom/google/gson/l;Ljava/lang/reflect/Type;Lcom/google/gson/j;)[B", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ByteArrayDeserializer implements k<byte[]> {
    @Override // com.google.gson.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] a(l json, Type typeOfT, j context) {
        if (!json.j()) {
            String strI = json.i();
            if (strI == null) {
                return null;
            }
            if (!a.f129766a.matcher(strI).matches()) {
                return strI.getBytes(d.UTF_8);
            }
            h hVarA = h.INSTANCE.a(strI);
            if (hVarA != null) {
                return hVarA.X();
            }
            return null;
        }
        i iVarE = json.e();
        if (iVarE == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(v.y(iVarE, 10));
        Iterator<l> it = iVarE.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().h());
        }
        byte[] bArr = new byte[arrayList.size()];
        int i15 = 0;
        for (Object obj : arrayList) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            bArr[i15] = ((Number) obj).byteValue();
            i15 = i16;
        }
        return bArr;
    }
}
