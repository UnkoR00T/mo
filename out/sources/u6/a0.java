package u6;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu6/a0;", "T", "Lu6/u;", "Lu6/w0;", "Ljava/io/File;", "file", "Lu6/l0;", "serializer", "<init>", "(Ljava/io/File;Lu6/l0;)V", "value", "Loq/i0;", "e", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0<T> extends u<T> implements w0<T> {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f195524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a0<T> f195526h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ T f195527j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a0<T> a0Var, T t15, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f195526h = a0Var;
            this.f195527j = t15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            Closeable closeable;
            Throwable th4;
            FileOutputStream fileOutputStream;
            Object objE = uq.b.e();
            int i15 = this.f195525g;
            if (i15 == 0) {
                oq.u.b(obj);
                try {
                    File file = this.f195526h.getFile();
                    FileOutputStream fileOutputStreamA = io.sentry.instrumentation.file.l.b.a(new FileOutputStream(file), file);
                    a0<T> a0Var = this.f195526h;
                    T t15 = this.f195527j;
                    try {
                        l0<T> l0VarH = a0Var.h();
                        u0 u0Var = new u0(fileOutputStreamA);
                        this.f195523e = fileOutputStreamA;
                        this.f195524f = fileOutputStreamA;
                        this.f195525g = 1;
                        if (l0VarH.a(t15, u0Var, this) == objE) {
                            return objE;
                        }
                        fileOutputStream = fileOutputStreamA;
                        closeable = fileOutputStream;
                    } catch (Throwable th5) {
                        closeable = fileOutputStreamA;
                        th4 = th5;
                        throw th4;
                    }
                } catch (Exception e15) {
                    if (e15 instanceof FileNotFoundException) {
                        throw q.c(this.f195526h.getFile().getParent(), e15);
                    }
                    throw e15;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileOutputStream = (FileOutputStream) this.f195524f;
                closeable = (Closeable) this.f195523e;
                try {
                    oq.u.b(obj);
                } catch (Throwable th6) {
                    th4 = th6;
                    try {
                        throw th4;
                    } catch (Throwable th7) {
                        ar.b.a(closeable, th4);
                        throw th7;
                    }
                }
            }
            fileOutputStream.getFD().sync();
            oq.i0 i0Var = oq.i0.f148189a;
            ar.b.a(closeable, null);
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new a(this.f195526h, this.f195527j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((a) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public a0(File file, l0<T> l0Var) {
        super(file, l0Var);
    }

    @Override // u6.w0
    public Object e(T t15, tq.e<? super oq.i0> eVar) throws Throwable {
        f();
        Object objB = z.b(getFile(), new a(this, t15, null), eVar);
        return objB == uq.b.e() ? objB : oq.i0.f148189a;
    }
}
