package ca;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p071kotlin.Metadata;
import p136y9.g;
import p136y9.l1;
import pq.v;
import pq.v0;
import uu.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\r\"\u0004\b\u0001\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b%\u0010*R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010&R\u0016\u00100\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0011¨\u00061"}, d2 = {"Lca/b;", "", "T", "Lxu/a;", "Lkotlinx/serialization/KSerializer;", "serializer", "", "", "Ly9/l1;", "typeMap", "<init>", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;)V", "value", "Loq/i0;", "J", "(Ljava/lang/Object;)V", "", "I", "(Ljava/lang/Object;)Ljava/util/Map;", "Luu/o;", "x", "(Luu/o;Ljava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "G", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", i.f37087n, "l", "()V", "Lkotlinx/serialization/encoding/Encoder;", "h", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "a", "Lkotlinx/serialization/KSerializer;", "b", "Ljava/util/Map;", "Lbv/c;", "c", "Lbv/c;", "()Lbv/c;", "serializersModule", "", "d", "map", "e", "elementIndex", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b<T> extends xu.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KSerializer<T> serializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, l1<Object>> typeMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bv.c serializersModule = bv.d.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<String>> map = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int elementIndex = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public b(KSerializer<T> kSerializer, Map<String, ? extends l1<Object>> map) {
        this.serializer = kSerializer;
        this.typeMap = map;
    }

    private final void J(Object value) {
        String strQ = this.serializer.getDescriptor().q(this.elementIndex);
        l1<Object> l1Var = this.typeMap.get(strQ);
        if (l1Var != null) {
            this.map.put(strQ, l1Var instanceof g ? ((g) l1Var).k(value) : v.e(l1Var.h(value)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + strQ + ". Please provide NavType through typeMap.").toString());
    }

    @Override // xu.a
    public boolean G(SerialDescriptor descriptor, int index) {
        this.elementIndex = index;
        return true;
    }

    @Override // xu.a
    public void H(Object value) {
        J(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, List<String>> I(Object value) {
        super.x(this.serializer, value);
        return v0.u(this.map);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: b, reason: from getter */
    public bv.c getSerializersModule() {
        return this.serializersModule;
    }

    @Override // xu.a, kotlinx.serialization.encoding.Encoder
    public Encoder h(SerialDescriptor descriptor) {
        if (d.f(descriptor)) {
            this.elementIndex = 0;
        }
        return super.h(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void l() {
        J(null);
    }

    @Override // xu.a, kotlinx.serialization.encoding.Encoder
    public <T> void x(o<? super T> serializer, T value) {
        J(value);
    }
}
