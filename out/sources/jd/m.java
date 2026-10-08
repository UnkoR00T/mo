package jd;

import fr.w;
import ju.x;
import ju.z;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;
import p076m2.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR/\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\bR/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\fR\u001b\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001b\u0010%\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 R\u001b\u0010(\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 ¨\u0006)"}, d2 = {"Ljd/m;", "Ljd/l;", "<init>", "()V", "Lfd/f;", "composition", "Loq/i0;", "k", "(Lfd/f;)V", "", "error", "l", "(Ljava/lang/Throwable;)V", "Lju/x;", "a", "Lju/x;", "compositionDeferred", "<set-?>", "b", "Lm2/a3;", "getValue", "()Lfd/f;", "B", "value", "c", "t", "()Ljava/lang/Throwable;", "A", "", "d", "Lm2/f6;", "isLoading", "()Z", "e", "y", "isComplete", "f", "isFailure", "g", "z", "isSuccess", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x<fd.f> compositionDeferred = z.c(null, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 value = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 error = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f6 isLoading = x5.d(new c());

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f6 isComplete = x5.d(new a());

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final f6 isFailure = x5.d(new b());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f6 isSuccess = x5.d(new d());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends w implements er.a<Boolean> {
        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.valueOf((m.this.getValue() == null && m.this.t() == null) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends w implements er.a<Boolean> {
        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.valueOf(m.this.t() != null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class c extends w implements er.a<Boolean> {
        c() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.valueOf(m.this.getValue() == null && m.this.t() == null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class d extends w implements er.a<Boolean> {
        d() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.valueOf(m.this.getValue() != null);
        }
    }

    private void A(Throwable th4) {
        this.error.setValue(th4);
    }

    private void B(fd.f fVar) {
        this.value.setValue(fVar);
    }

    public final synchronized void k(fd.f composition) {
        if (y()) {
            return;
        }
        B(composition);
        this.compositionDeferred.d0(composition);
    }

    public final synchronized void l(Throwable error) {
        if (y()) {
            return;
        }
        A(error);
        this.compositionDeferred.p(error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Throwable t() {
        return (Throwable) this.error.getValue();
    }

    public boolean y() {
        return ((Boolean) this.isComplete.getValue()).booleanValue();
    }

    public boolean z() {
        return ((Boolean) this.isSuccess.getValue()).booleanValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p076m2.f6
    public fd.f getValue() {
        return (fd.f) this.value.getValue();
    }
}
