package bp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<cp.k> f20675a;

    class a extends dp.e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ dp.c f20676c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dp.g gVar, dp.c cVar) {
            super(gVar);
            this.f20676c = cVar;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f20676c.close();
        }
    }

    private g(InputStream inputStream, List<cp.k> list) {
        super(inputStream);
        this.f20675a = list;
    }

    static g b(List<cp.l> list, d dVar, InputStream inputStream, dp.i iVar, cp.j jVar) throws IOException {
        d dVar2;
        cp.j jVar2;
        InputStream byteArrayInputStream;
        if (list.isEmpty()) {
            return new g(inputStream, Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 1 && new HashSet(list).size() != list.size()) {
            throw new IOException("Duplicate");
        }
        InputStream inputStream2 = inputStream;
        int i15 = 0;
        while (i15 < list.size()) {
            if (iVar != null) {
                dp.c cVarH = iVar.h();
                dVar2 = dVar;
                jVar2 = jVar;
                arrayList.add(list.get(i15).b(inputStream2, new dp.f(cVarH), dVar2, i15, jVar2));
                byteArrayInputStream = new a(cVarH, cVarH);
            } else {
                dVar2 = dVar;
                jVar2 = jVar;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                arrayList.add(list.get(i15).b(inputStream2, byteArrayOutputStream, dVar2, i15, jVar2));
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
            inputStream2 = byteArrayInputStream;
            i15++;
            dVar = dVar2;
            jVar = jVar2;
        }
        return new g(inputStream2, arrayList);
    }

    public cp.k h() {
        if (this.f20675a.isEmpty()) {
            return cp.k.f37220c;
        }
        List<cp.k> list = this.f20675a;
        return list.get(list.size() - 1);
    }
}
