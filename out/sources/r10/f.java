package r10;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import er.p;
import fu.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.CancellationException;
import ju.g1;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.n;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u0000 \u00182\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0097@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0017\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0017\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b \u0010\u001fJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0017\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b!\u0010\u001fJ*\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u00102\u0006\u0010\"\u001a\u00020\fH\u0096@¢\u0006\u0004\b%\u0010&J$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010'\u001a\u00020\fH\u0096@¢\u0006\u0004\b(\u0010&J\u001a\u0010)\u001a\u0004\u0018\u00010\f2\u0006\u0010'\u001a\u00020\fH\u0097@¢\u0006\u0004\b)\u0010&J\u001a\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010'\u001a\u00020\fH\u0097@¢\u0006\u0004\b+\u0010&J\u001a\u0010,\u001a\u0004\u0018\u00010\f2\u0006\u0010'\u001a\u00020\fH\u0096@¢\u0006\u0004\b,\u0010&J\u001c\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020$0\u0010H\u0096@¢\u0006\u0004\b-\u0010.J$\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020$0\u00102\u0006\u0010'\u001a\u00020\fH\u0096@¢\u0006\u0004\b/\u0010&J\u0019\u00100\u001a\u0004\u0018\u00010\f2\u0006\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105¨\u00066"}, d2 = {"Lr10/f;", "Laz/f;", "Landroid/content/Context;", "applicationContext", "Ls10/a;", "fileRegistry", "Lpx/d;", "remoteLogger", "<init>", "(Landroid/content/Context;Ls10/a;Lpx/d;)V", "", "bytes", "", "fileName", "", "excludeFromRegister", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "([BLjava/lang/String;ZLtq/e;)Ljava/lang/Object;", "Ljava/io/InputStream;", "input", "filePath", "d", "(Ljava/io/InputStream;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "fileExtension", "a", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Laz/g;", "e", "(Laz/g;Ltq/e;)Ljava/lang/Object;", "j", "l", "path", "", "Ljava/io/File;", "h", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "uri", "m", "f", "", "k", "r", "g", "(Ltq/e;)Ljava/lang/Object;", "n", "i", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "b", "Ls10/a;", "Lpx/d;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements az.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s10.a fileRegistry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends File>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170420e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f170420e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(File.createTempFile(f.this.applicationContext.getPackageName(), null, f.this.applicationContext.getCacheDir()));
            } catch (IOException e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            } catch (Exception e16) {
                return new dx.i.Left(new dx.b.Generic(e16));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, ? extends File>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends File>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170422e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f170424g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f170424g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f170422e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                File fileCreateTempFile = File.createTempFile(f.this.applicationContext.getPackageName(), null, f.this.applicationContext.getCacheDir());
                InputStream inputStreamOpenInputStream = f.this.applicationContext.getContentResolver().openInputStream(Uri.parse(this.f170424g));
                if (inputStreamOpenInputStream != null) {
                    try {
                        FileOutputStream fileOutputStreamA = io.sentry.instrumentation.file.l.b.a(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
                        try {
                            byte[] bArr = new byte[PKIFailureInfo.certConfirmed];
                            while (true) {
                                int i15 = inputStreamOpenInputStream.read(bArr);
                                if (i15 == -1) {
                                    break;
                                }
                                fileOutputStreamA.write(bArr, 0, i15);
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    ar.b.a(inputStreamOpenInputStream, th);
                                    throw th4;
                                }
                            }
                            i0 i0Var = i0.f148189a;
                            ar.b.a(fileOutputStreamA, null);
                            ar.b.a(inputStreamOpenInputStream, null);
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                ar.b.a(fileOutputStreamA, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                return new dx.i.Right(fileCreateTempFile);
            } catch (IOException e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            } catch (NullPointerException e16) {
                return new dx.i.Left(new dx.b.Generic(e16));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, ? extends File>> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new c(this.f170424g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170426f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170427g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f170428h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f170429j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f170430k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f170431l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f170432m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f170433n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f170434p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f170435q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ az.g f170436r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ f f170437s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(az.g gVar, f fVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f170436r = gVar;
            this.f170437s = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ad A[Catch: Exception -> 0x0024, c -> 0x0027, CancellationException -> 0x002a, TryCatch #5 {Exception -> 0x0024, blocks: (B:6:0x0020, B:23:0x007d, B:35:0x00a6, B:39:0x00b1, B:38:0x00ad, B:43:0x00c1, B:46:0x00cf), top: B:61:0x0008 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v7 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            f fVar;
            File file;
            az.g gVar;
            ?? E = uq.b.e();
            int i15 = this.f170435q;
            boolean zDelete = false;
            try {
                try {
                    if (i15 == 0) {
                        u.b(obj);
                        az.g gVar2 = this.f170436r;
                        fVar = this.f170437s;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            if (gVar2 instanceof az.g.File) {
                                s10.a aVar2 = fVar.fileRegistry;
                                String fileName = ((az.g.File) gVar2).getFileName();
                                this.f170425e = gVar2;
                                this.f170426f = fVar;
                                this.f170427g = jVarA;
                                this.f170428h = vq.j.a(aVar);
                                this.f170429j = vq.j.a(aVar);
                                this.f170430k = 0;
                                this.f170431l = 0;
                                this.f170432m = 0;
                                this.f170433n = 0;
                                this.f170434p = 0;
                                this.f170435q = 1;
                                if (aVar2.a(fileName, this) == E) {
                                    return E;
                                }
                                gVar = gVar2;
                            } else {
                                if (!(gVar2 instanceof az.g.Path)) {
                                    throw new oq.p();
                                }
                                file = new File(((az.g.Path) gVar2).getFilePath());
                            }
                            if (file.isDirectory()) {
                                zDelete = file.delete();
                            }
                            return new dx.i.Right(vq.b.a(zDelete));
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar2 = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (f) this.f170426f;
                    gVar = (az.g) this.f170425e;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                    file = fVar.applicationContext.getFileStreamPath(((az.g.File) gVar).getFileName());
                    if (file.isDirectory()) {
                        zDelete = file.delete();
                    }
                    return new dx.i.Right(vq.b.a(zDelete));
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f170436r, this.f170437s, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ az.g f170439f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f170440g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(az.g gVar, f fVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f170439f = gVar;
            this.f170440g = fVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            File file;
            uq.b.e();
            if (this.f170438e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            az.g gVar = this.f170439f;
            f fVar = this.f170440g;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        new ex.a();
                        if (gVar instanceof az.g.File) {
                            file = fVar.applicationContext.getFileStreamPath(((az.g.File) gVar).getFileName());
                        } else {
                            if (!(gVar instanceof az.g.Path)) {
                                throw new oq.p();
                            }
                            file = new File(((az.g.Path) gVar).getFilePath());
                        }
                        return new dx.i.Right(vq.b.a(file.exists()));
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (Exception e18) {
                px.f fVar2 = px.f.f163100a;
                String message = e18.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar2.d(message, e18, px.c.a(jVarA));
                Object objA = jVarA.a(e18);
                if (objA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                } else {
                    if (!(objA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) objA).b();
                }
                return new dx.i.Left(objB);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f170439f, this.f170440g, eVar);
        }
    }

    /* JADX INFO: renamed from: r10.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C4315f extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends byte[]>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170441e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f170443g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4315f(String str, tq.e<? super C4315f> eVar) {
            super(2, eVar);
            this.f170443g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f170441e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                InputStream inputStreamOpenInputStream = f.this.applicationContext.getContentResolver().openInputStream(Uri.parse(this.f170443g));
                return inputStreamOpenInputStream != null ? new dx.i.Right(ar.a.c(inputStreamOpenInputStream)) : new dx.i.Left(new dx.b.Generic(new Exception("Could not open InputStream")));
            } catch (FileNotFoundException e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, byte[]>> eVar) {
            return ((C4315f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new C4315f(this.f170443g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "Ljava/io/File;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends File>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f170445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f170446g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, f fVar, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f170445f = str;
            this.f170446g = fVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            File[] fileArrListFiles;
            List listN;
            uq.b.e();
            if (this.f170444e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            String str = this.f170445f;
            f fVar = this.f170446g;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        new ex.a();
                        File filesDir = r.t0(str) ? fVar.applicationContext.getFilesDir() : new File(str);
                        if (!filesDir.isDirectory() || (fileArrListFiles = filesDir.listFiles()) == null || (listN = n.f(fileArrListFiles)) == null) {
                            listN = v.n();
                        }
                        return new dx.i.Right(listN);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (Exception e18) {
                px.f fVar2 = px.f.f163100a;
                String message = e18.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar2.d(message, e18, px.c.a(jVarA));
                Object objA = jVarA.a(e18);
                if (objA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                } else {
                    if (!(objA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) objA).b();
                }
                return new dx.i.Left(objB);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends File>>> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new g(this.f170445f, this.f170446g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements p<p0, tq.e<? super String>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170447e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f170449g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f170449g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i left;
            Object objB;
            uq.b.e();
            if (this.f170447e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Cursor cursorQuery = f.this.applicationContext.getContentResolver().query(Uri.parse(this.f170449g), null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    ar.b.a(cursorQuery, null);
                    return null;
                }
                try {
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        try {
                            new ex.a();
                            left = new dx.i.Right(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")));
                        } catch (Exception e15) {
                            px.f fVar = px.f.f163100a;
                            String message = e15.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e15, px.c.a(jVarA));
                            Object objA = jVarA.a(e15);
                            if (objA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                            } else {
                                if (!(objA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) objA).b();
                            }
                            left = new dx.i.Left(objB);
                        }
                    } catch (ex.c e16) {
                        left = new dx.i.Left((dx.b) ex.d.a(e16));
                    } catch (CancellationException e17) {
                        throw e17;
                    }
                    String str = (String) left.a();
                    ar.b.a(cursorQuery, null);
                    return str;
                } catch (CancellationException e18) {
                    throw e18;
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(cursorQuery, th4);
                    throw th5;
                }
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super String> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new h(this.f170449g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)F"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements p<p0, tq.e<? super Float>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170450e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f170452g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f170452g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f170450e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Cursor cursorQuery = f.this.applicationContext.getContentResolver().query(Uri.parse(this.f170452g), null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                Float fD = cursorQuery.moveToFirst() ? vq.b.d(cursorQuery.getFloat(cursorQuery.getColumnIndex("_size"))) : null;
                ar.b.a(cursorQuery, null);
                return fD;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(cursorQuery, th4);
                    throw th5;
                }
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Float> eVar) {
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new i(this.f170452g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends byte[]>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ az.g f170454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f170455g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(az.g gVar, f fVar, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f170454f = gVar;
            this.f170455g = fVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            FileInputStream fileInputStreamA;
            uq.b.e();
            if (this.f170453e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            az.g gVar = this.f170454f;
            f fVar = this.f170455g;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        new ex.a();
                        if (gVar instanceof az.g.File) {
                            fileInputStreamA = fVar.applicationContext.openFileInput(((az.g.File) gVar).getFileName());
                        } else {
                            if (!(gVar instanceof az.g.Path)) {
                                throw new oq.p();
                            }
                            File file = new File(((az.g.Path) gVar).getFilePath());
                            fileInputStreamA = io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file);
                        }
                        byte[] bArr = new byte[(int) fileInputStreamA.getChannel().size()];
                        fileInputStreamA.read(bArr);
                        return new dx.i.Right(bArr);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (Exception e18) {
                px.f fVar2 = px.f.f163100a;
                String message = e18.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar2.d(message, e18, px.c.a(jVarA));
                Object objA = jVarA.a(e18);
                if (objA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                } else {
                    if (!(objA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) objA).b();
                }
                return new dx.i.Left(objB);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) {
            return ((j) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new j(this.f170454f, this.f170455g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f170457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f170458g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f170459h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f170460j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f170461k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f170462l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f170463m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f170464n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f170465p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f170467r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f170468s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ byte[] f170469t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, boolean z15, byte[] bArr, tq.e<? super k> eVar) {
            super(2, eVar);
            this.f170467r = str;
            this.f170468s = z15;
            this.f170469t = bArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v7 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            ?? E = uq.b.e();
            int i15 = this.f170465p;
            try {
                try {
                    if (i15 == 0) {
                        u.b(obj);
                        f fVar = f.this;
                        String str = this.f170467r;
                        boolean z15 = this.f170468s;
                        byte[] bArr = this.f170469t;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            FileOutputStream fileOutputStreamOpenFileOutput = fVar.applicationContext.openFileOutput(str, 0);
                            try {
                                fileOutputStreamOpenFileOutput.write(bArr);
                                fileOutputStreamOpenFileOutput.flush();
                                i0 i0Var = i0.f148189a;
                                ar.b.a(fileOutputStreamOpenFileOutput, null);
                                if (!z15) {
                                    s10.a aVar2 = fVar.fileRegistry;
                                    this.f170461k = jVarA;
                                    this.f170462l = vq.j.a(aVar);
                                    this.f170463m = vq.j.a(aVar);
                                    this.f170464n = vq.j.a(fileOutputStreamOpenFileOutput);
                                    this.f170456e = 0;
                                    this.f170457f = 0;
                                    this.f170458g = 0;
                                    this.f170459h = 0;
                                    this.f170460j = 0;
                                    this.f170465p = 1;
                                    if (aVar2.d(str, this) == E) {
                                        return E;
                                    }
                                }
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    ar.b.a(fileOutputStreamOpenFileOutput, th4);
                                    throw th5;
                                }
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar2 = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
            return ((k) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new k(this.f170467r, this.f170468s, this.f170469t, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f170471f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f170472g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ InputStream f170473h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, f fVar, InputStream inputStream, tq.e<? super l> eVar) {
            super(2, eVar);
            this.f170471f = str;
            this.f170472g = fVar;
            this.f170473h = inputStream;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f170470e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                try {
                    String str = this.f170471f;
                    FileOutputStream fileOutputStreamD = io.sentry.instrumentation.file.l.b.d(new FileOutputStream(str), str);
                    f fVar = this.f170472g;
                    InputStream inputStream = this.f170473h;
                    try {
                        fVar.remoteLogger.F8("File output stream opened", px.d.a.GENERAL);
                        byte[] bArr = new byte[PKIFailureInfo.certConfirmed];
                        while (true) {
                            int i15 = inputStream.read(bArr);
                            if (i15 == -1) {
                                fileOutputStreamD.flush();
                                i0 i0Var = i0.f148189a;
                                ar.b.a(fileOutputStreamD, null);
                                this.f170472g.remoteLogger.F8("Data successfully wrote into file output stream", px.d.a.GENERAL);
                                dx.i.Right right = new dx.i.Right(vq.b.a(true));
                                try {
                                    this.f170473h.close();
                                    return right;
                                } catch (Exception unused) {
                                    return right;
                                }
                            }
                            fileOutputStreamD.write(bArr, 0, i15);
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            ar.b.a(fileOutputStreamD, th4);
                            throw th5;
                        }
                    }
                } catch (Exception e15) {
                    dx.i.Left left = new dx.i.Left(new dx.b.Generic(e15));
                    try {
                        this.f170473h.close();
                    } catch (Exception unused2) {
                    }
                    return left;
                }
            } catch (Throwable th6) {
                try {
                    this.f170473h.close();
                } catch (Exception unused3) {
                }
                throw th6;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, Boolean>> eVar) {
            return ((l) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new l(this.f170471f, this.f170472g, this.f170473h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends String>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170476g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f170477h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f170478j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f170480l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ InputStream f170481m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f170482n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, InputStream inputStream, String str2, tq.e<? super m> eVar) {
            super(2, eVar);
            this.f170480l = str;
            this.f170481m = inputStream;
            this.f170482n = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object left;
            Uri uri;
            Object objE = uq.b.e();
            int i15 = this.f170478j;
            try {
                if (i15 == 0) {
                    u.b(obj);
                    ContentResolver contentResolver = f.this.applicationContext.getContentResolver();
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(this.f170480l);
                    px.d dVar = f.this.remoteLogger;
                    px.d.a aVar = px.d.a.GENERAL;
                    dVar.F8("MimeType successfully got from fileExtension", aVar);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", this.f170482n);
                    contentValues.put("mime_type", mimeTypeFromExtension);
                    contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                    Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                    if (uriInsert == null) {
                        throw new Exception("Failed to insert content into MediaStore. Uri returned is null");
                    }
                    f.this.remoteLogger.F8("Uri successfully created", aVar);
                    OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    if (outputStreamOpenOutputStream != null) {
                        f fVar = f.this;
                        InputStream inputStream = this.f170481m;
                        try {
                            fVar.remoteLogger.F8("ContentResolver output stream opened", aVar);
                            byte[] bArr = new byte[PKIFailureInfo.certConfirmed];
                            while (true) {
                                int i16 = inputStream.read(bArr);
                                if (i16 == -1) {
                                    break;
                                }
                                outputStreamOpenOutputStream.write(bArr, 0, i16);
                            }
                            i0 i0Var = i0.f148189a;
                            ar.b.a(outputStreamOpenOutputStream, null);
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                ar.b.a(outputStreamOpenOutputStream, th4);
                                throw th5;
                            }
                        }
                    }
                    f.this.remoteLogger.F8("Data successfully wrote into contentResolver output stream", px.d.a.GENERAL);
                    f fVar2 = f.this;
                    String string = uriInsert.toString();
                    this.f170474e = vq.j.a(contentResolver);
                    this.f170475f = vq.j.a(mimeTypeFromExtension);
                    this.f170476g = vq.j.a(contentValues);
                    this.f170477h = uriInsert;
                    this.f170478j = 1;
                    obj = fVar2.r(string, this);
                    if (obj == objE) {
                        return objE;
                    }
                    uri = uriInsert;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uri = (Uri) this.f170477h;
                    u.b(obj);
                }
                String str = (String) obj;
                if (str != null) {
                    f.this.remoteLogger.F8("File path successfully got from created uri", px.d.a.GENERAL);
                    left = new dx.i.Right(str);
                    return left;
                }
                throw new Exception("Failed to get file path from Uri: " + uri);
            } catch (Exception e15) {
                left = new dx.i.Left(new dx.b.Generic(e15));
            } finally {
                try {
                    this.f170481m.close();
                } catch (Exception unused) {
                }
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, String>> eVar) {
            return ((m) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new m(this.f170480l, this.f170481m, this.f170482n, eVar);
        }
    }

    public f(Context context, s10.a aVar, px.d dVar) {
        this.applicationContext = context;
        this.fileRegistry = aVar;
        this.remoteLogger = dVar;
    }

    @Override // az.f
    public Object a(InputStream inputStream, String str, String str2, tq.e<? super dx.i<? extends dx.b, String>> eVar) {
        return ju.i.g(g1.b(), new m(str2, inputStream, str, null), eVar);
    }

    @Override // az.f
    public Object c(byte[] bArr, String str, boolean z15, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return ju.i.g(g1.b(), new k(str, z15, bArr, null), eVar);
    }

    @Override // az.f
    public Object d(InputStream inputStream, String str, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
        return ju.i.g(g1.b(), new l(str, this, inputStream, null), eVar);
    }

    @Override // az.f
    public Object e(az.g gVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
        return ju.i.g(g1.b(), new d(gVar, this, null), eVar);
    }

    @Override // az.f
    @SuppressLint({"Range"})
    public Object f(String str, tq.e<? super String> eVar) {
        Cursor cursorQuery = this.applicationContext.getContentResolver().query(Uri.parse(str), null, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                    ar.b.a(cursorQuery, null);
                    return string;
                }
                i0 i0Var = i0.f148189a;
                ar.b.a(cursorQuery, null);
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(cursorQuery, th4);
                    throw th5;
                }
            }
        }
        return null;
    }

    @Override // az.f
    public Object g(tq.e<? super dx.i<? extends dx.b, ? extends File>> eVar) {
        return ju.i.g(g1.b(), new b(null), eVar);
    }

    @Override // az.f
    public Object h(String str, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends File>>> eVar) {
        return ju.i.g(g1.b(), new g(str, this, null), eVar);
    }

    @Override // az.f
    public String i(String uri) {
        return this.applicationContext.getContentResolver().getType(Uri.parse(uri));
    }

    @Override // az.f
    public Object j(az.g gVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
        return ju.i.g(g1.b(), new e(gVar, this, null), eVar);
    }

    @Override // az.f
    @SuppressLint({"Range"})
    public Object k(String str, tq.e<? super Float> eVar) {
        return ju.i.g(g1.b(), new i(str, null), eVar);
    }

    @Override // az.f
    public Object l(az.g gVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) {
        return ju.i.g(g1.b(), new j(gVar, this, null), eVar);
    }

    @Override // az.f
    public Object m(String str, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) {
        return ju.i.g(g1.b(), new C4315f(str, null), eVar);
    }

    @Override // az.f
    public Object n(String str, tq.e<? super dx.i<? extends dx.b, ? extends File>> eVar) {
        return ju.i.g(g1.b(), new c(str, null), eVar);
    }

    public Object r(String str, tq.e<? super String> eVar) {
        return ju.i.g(g1.b(), new h(str, null), eVar);
    }
}
