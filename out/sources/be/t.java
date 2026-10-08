package be;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class t<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<Data> f18810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i6.f<List<Throwable>> f18811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f18812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18813d;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, i6.f<List<Throwable>> fVar) {
        this.f18810a = cls;
        this.f18811b = fVar;
        this.f18812c = (List) ve.k.c(list);
        this.f18813d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, zd.h hVar, int i15, int i16, i.a<ResourceType> aVar, List<Throwable> list) throws q {
        int size = this.f18812c.size();
        v<Transcode> vVarA = null;
        for (int i17 = 0; i17 < size; i17++) {
            try {
                vVarA = this.f18812c.get(i17).a(eVar, i15, i16, hVar, aVar);
            } catch (q e15) {
                list.add(e15);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f18813d, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, zd.h hVar, int i15, int i16, i.a<ResourceType> aVar) {
        List<Throwable> list = (List) ve.k.d(this.f18811b.z());
        try {
            return b(eVar, hVar, i15, i16, aVar, list);
        } finally {
            this.f18811b.A(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f18812c.toArray()) + '}';
    }
}
