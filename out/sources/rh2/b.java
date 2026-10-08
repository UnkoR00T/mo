package rh2;

import er.p;
import fu.r;
import iy.a0;
import iy.b0;
import iy.i;
import iy.v;
import java.io.File;
import java.util.List;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.j;
import vq.k;
import y00.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*¨\u0006+"}, d2 = {"Lrh2/b;", "Loi2/b;", "Ly00/h0;", "securityProviderFactory", "Liy/i;", "cipherRsa", "Liy/g;", "cipherAes", "Liy/v;", "pkcs12Manager", "Liy/c;", "bytesConverter", "Laz/f;", "fileManager", "<init>", "(Ly00/h0;Liy/i;Liy/g;Liy/v;Liy/c;Laz/f;)V", "", "pkcs12", "oldPassword", "newPassword", "b", "([B[B[B)[B", "", "fileName", "", "a", "(Ljava/lang/String;)Z", "d", "filePrefix", "Loq/i0;", "c", "(Ljava/lang/String;)V", "e", "(Ljava/lang/String;)[B", "bytes", "f", "(Ljava/lang/String;[B)V", "Ly00/h0;", "Liy/i;", "Liy/g;", "Liy/v;", "Liy/c;", "Laz/f;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements oi2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0 securityProviderFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i cipherRsa;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v pkcs12Manager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final az.f fileManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)[B"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, tq.e<? super byte[]>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f173850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f173851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f173852g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ byte[] f173854j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ byte[] f173855k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ byte[] f173856l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(byte[] bArr, byte[] bArr2, byte[] bArr3, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f173854j = bArr;
            this.f173855k = bArr2;
            this.f173856l = bArr3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173852g;
            if (i15 == 0) {
                u.b(obj);
                iy.c cVar = b.this.bytesConverter;
                byte[] bArr = this.f173854j;
                iy.b.a aVar = iy.b.a.f97723a;
                char[] cArrA = cVar.c(bArr, aVar).a();
                if (cArrA != null) {
                    b0 b0Var = new b0(cArrA);
                    char[] cArrA2 = b.this.bytesConverter.c(this.f173855k, aVar).a();
                    if (cArrA2 != null) {
                        b0 b0Var2 = new b0(cArrA2);
                        v vVar = b.this.pkcs12Manager;
                        a0 a0Var = new a0(this.f173856l);
                        this.f173850e = j.a(b0Var);
                        this.f173851f = j.a(b0Var2);
                        this.f173852g = 1;
                        obj = vVar.b(a0Var, b0Var, b0Var2, this);
                        if (obj == objE) {
                            return objE;
                        }
                    }
                }
                return null;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            a0 a0Var2 = (a0) ((dx.i) obj).a();
            if (a0Var2 != null) {
                return a0Var2.getData();
            }
            return null;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super byte[]> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new a(this.f173854j, this.f173855k, this.f173856l, eVar);
        }
    }

    /* JADX INFO: renamed from: rh2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class C4443b extends k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173857e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f173859g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4443b(String str, tq.e<? super C4443b> eVar) {
            super(2, eVar);
            this.f173859g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173857e;
            if (i15 == 0) {
                u.b(obj);
                az.f fVar = b.this.fileManager;
                az.g.File file = new az.g.File(this.f173859g);
                this.f173857e = 1;
                obj = fVar.e(file, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return vq.b.a(false);
            }
            if (iVar instanceof dx.i.Right) {
                return ((dx.i.Right) iVar).b();
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((C4443b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new C4443b(this.f173859g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173860e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f173862g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f173862g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173860e;
            if (i15 == 0) {
                u.b(obj);
                az.f fVar = b.this.fileManager;
                this.f173860e = 1;
                obj = fVar.h("", this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            List<File> list = (List) ((dx.i) obj).a();
            if (list != null) {
                String str = this.f173862g;
                for (File file : list) {
                    if (r.V(file.getName(), str, false, 2, null)) {
                        file.delete();
                    }
                }
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new c(this.f173862g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173863e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f173865g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f173865g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173863e;
            if (i15 == 0) {
                u.b(obj);
                az.f fVar = b.this.fileManager;
                az.g.File file = new az.g.File(this.f173865g);
                this.f173863e = 1;
                obj = fVar.j(file, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return vq.b.a(false);
            }
            if (iVar instanceof dx.i.Right) {
                return ((dx.i.Right) iVar).b();
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new d(this.f173865g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)[B"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements p<p0, tq.e<? super byte[]>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173866e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f173868g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f173868g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173866e;
            if (i15 == 0) {
                u.b(obj);
                az.f fVar = b.this.fileManager;
                az.g.File file = new az.g.File(this.f173868g);
                this.f173866e = 1;
                obj = fVar.l(file, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return new byte[0];
            }
            if (iVar instanceof dx.i.Right) {
                return ((dx.i.Right) iVar).b();
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super byte[]> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new e(this.f173868g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173869e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ byte[] f173871g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f173872h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(byte[] bArr, String str, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f173871g = bArr;
            this.f173872h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173869e;
            if (i15 == 0) {
                u.b(obj);
                az.f fVar = b.this.fileManager;
                byte[] bArr = this.f173871g;
                String str = this.f173872h;
                this.f173869e = 1;
                obj = az.f.b(fVar, bArr, str, false, this, 4, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                ((dx.i.Right) iVar).b();
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new f(this.f173871g, this.f173872h, eVar);
        }
    }

    public b(h0 h0Var, i iVar, iy.g gVar, v vVar, iy.c cVar, az.f fVar) {
        this.securityProviderFactory = h0Var;
        this.cipherRsa = iVar;
        this.cipherAes = gVar;
        this.pkcs12Manager = vVar;
        this.bytesConverter = cVar;
        this.fileManager = fVar;
    }

    @Override // oi2.b
    public boolean a(String fileName) {
        return ((Boolean) ju.j.b(null, new d(fileName, null), 1, null)).booleanValue();
    }

    @Override // oi2.b
    public byte[] b(byte[] pkcs12, byte[] oldPassword, byte[] newPassword) {
        return (byte[]) ju.j.b(null, new a(oldPassword, newPassword, pkcs12, null), 1, null);
    }

    @Override // oi2.b
    public void c(String filePrefix) {
        ju.j.b(null, new c(filePrefix, null), 1, null);
    }

    @Override // oi2.b
    public boolean d(String fileName) {
        return ((Boolean) ju.j.b(null, new C4443b(fileName, null), 1, null)).booleanValue();
    }

    @Override // oi2.b
    public byte[] e(String fileName) {
        return (byte[]) ju.j.b(null, new e(fileName, null), 1, null);
    }

    @Override // oi2.b
    public void f(String fileName, byte[] bytes) {
        ju.j.b(null, new f(bytes, fileName, null), 1, null);
    }
}
