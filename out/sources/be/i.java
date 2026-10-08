package be;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class i<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<DataType> f18717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<? extends zd.j<DataType, ResourceType>> f18718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ne.e<ResourceType, Transcode> f18719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i6.f<List<Throwable>> f18720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f18721e;

    interface a<ResourceType> {
        v<ResourceType> a(v<ResourceType> vVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends zd.j<DataType, ResourceType>> list, ne.e<ResourceType, Transcode> eVar, i6.f<List<Throwable>> fVar) {
        this.f18717a = cls;
        this.f18718b = list;
        this.f18719c = eVar;
        this.f18720d = fVar;
        this.f18721e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i15, int i16, zd.h hVar) {
        List<Throwable> list = (List) ve.k.d(this.f18720d.z());
        try {
            return c(eVar, i15, i16, hVar, list);
        } finally {
            this.f18720d.A(list);
        }
    }

    private v<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i15, int i16, zd.h hVar, List<Throwable> list) throws q {
        int size = this.f18718b.size();
        v<ResourceType> vVarB = null;
        for (int i17 = 0; i17 < size; i17++) {
            zd.j<DataType, ResourceType> jVar = this.f18718b.get(i17);
            try {
                if (jVar.a(eVar.a(), hVar)) {
                    vVarB = jVar.b(eVar.a(), i15, i16, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e15) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(jVar);
                }
                list.add(e15);
            }
            if (vVarB != null) {
                break;
            }
        }
        if (vVarB != null) {
            return vVarB;
        }
        throw new q(this.f18721e, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i15, int i16, zd.h hVar, a<ResourceType> aVar) {
        return this.f18719c.a(aVar.a(b(eVar, i15, i16, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f18717a + ", decoders=" + this.f18718b + ", transcoder=" + this.f18719c + '}';
    }
}
