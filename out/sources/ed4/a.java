package ed4;

import ay.h;
import ay.j;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.g;
import java.lang.reflect.Type;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.m;
import pl.gov.coi.common.network.o;
import pl.gov.coi.mobywatel.be.offlinedocumentsservice.deserializer.DocumentTypeDeserializer;
import rq0.b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Led4/a;", "Lay/h;", "Lpl/gov/coi/common/network/m;", "gsonFactory", "Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/deserializer/DocumentTypeDeserializer;", "documentTypeDeserializer", "<init>", "(Lpl/gov/coi/common/network/m;Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/deserializer/DocumentTypeDeserializer;)V", "Ljava/lang/reflect/Type;", "type", "", "adapter", "Lcom/google/gson/f;", "d", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/f;", "Lpl/gov/coi/common/network/o;", "e", "()Lpl/gov/coi/common/network/o;", "Lay/j;", "c", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lay/j;", "factory", "f", "(Ljava/lang/Object;)Lpl/gov/coi/common/network/o;", "a", "Lpl/gov/coi/common/network/m;", "b", "Lcom/google/gson/f;", "gson", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m gsonFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f gson;

    public a(m mVar, DocumentTypeDeserializer documentTypeDeserializer) {
        this.gsonFactory = mVar;
        this.gson = mVar.d(b.class, documentTypeDeserializer);
    }

    private final f d(Type type, Object adapter) {
        g gVarP = this.gson.p();
        gVarP.e(type, adapter);
        return gVarP.b();
    }

    @Override // ay.h
    public j c(Type type, Object adapter) {
        return new o(d(type, adapter));
    }

    @Override // ay.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public o b() {
        return new o(this.gson);
    }

    @Override // ay.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public o a(Object factory) {
        return new o(this.gson.p().f((b0) factory).b());
    }
}
