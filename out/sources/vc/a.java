package vc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvc/a;", "", "<init>", "()V", "Lvv/g;", "source", "Lvc/s;", "a", "(Lvv/g;)Lvc/s;", "response", "Lvv/f;", "sink", "Loq/i0;", "b", "(Lvc/s;Lvv/f;)V", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f205955a = new a();

    private a() {
    }

    public final NetworkResponse a(vv.g source) {
        int i15 = Integer.parseInt(source.N1());
        long j15 = Long.parseLong(source.N1());
        long j16 = Long.parseLong(source.N1());
        NetworkHeaders.a aVar = new NetworkHeaders.a();
        int i16 = Integer.parseInt(source.N1());
        for (int i17 = 0; i17 < i16; i17++) {
            wc.e.b(aVar, source.N1());
        }
        return new NetworkResponse(i15, j15, j16, aVar.b(), null, null, 48, null);
    }

    public final void b(NetworkResponse response, vv.f sink) {
        sink.k2(response.getCode()).writeByte(10);
        sink.k2(response.getRequestMillis()).writeByte(10);
        sink.k2(response.getResponseMillis()).writeByte(10);
        Set<Map.Entry<String, List<String>>> setEntrySet = response.getHeaders().b().entrySet();
        Iterator<T> it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        sink.k2(size).writeByte(10);
        for (Map.Entry<String, List<String>> entry : setEntrySet) {
            Iterator<String> it4 = entry.getValue().iterator();
            while (it4.hasNext()) {
                sink.k1(entry.getKey()).k1(":").k1(it4.next()).writeByte(10);
            }
        }
    }
}
