package b00;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ju.p0;
import oq.i0;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import vy.Coordinates;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0016H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010!\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001cH\u0096@¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b#\u0010\u0010J\u001a\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)¨\u0006*"}, d2 = {"Lb00/a;", "Lxx/a;", "Landroid/content/Context;", "context", "Laz/f;", "fileManager", "Liy/a;", "base64Coder", "Lxw/d;", "dispatcherProvider", "<init>", "(Landroid/content/Context;Laz/f;Liy/a;Lxw/d;)V", "", "image", "Ljava/io/File;", "k", "([BLtq/e;)Ljava/lang/Object;", "", "uri", "", "Lxx/b;", "tagsGroups", "", "e", "(Ljava/lang/String;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "attributes", "c", "([BLjava/util/Map;Ltq/e;)Ljava/lang/Object;", "Lvy/c;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "imageBase64", "gpsCoordinates", "a", "(Ljava/lang/String;Lvy/c;Ltq/e;)Ljava/lang/Object;", "f", "", "b", "Landroid/content/Context;", "Laz/f;", "Liy/a;", "Lxw/d;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final az.f fileManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: b00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    static final class C0366a extends vq.k implements er.p<p0, tq.e<? super String>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f15623f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f15625h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Coordinates f15626j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0366a(String str, Coordinates coordinates, tq.e<? super C0366a> eVar) {
            super(2, eVar);
            this.f15625h = str;
            this.f15626j = coordinates;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            File file;
            p0 p0Var = (p0) this.f15623f;
            Object objE = uq.b.e();
            int i15 = this.f15622e;
            File file2 = null;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    a aVar = a.this;
                    dx.i iVarC = iy.a.c(aVar.base64Coder, this.f15625h, null, 2, null);
                    if (iVarC instanceof dx.i.Left) {
                        return null;
                    }
                    if (!(iVarC instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    byte[] bArr = (byte[]) ((dx.i.Right) iVarC).b();
                    this.f15623f = p0Var;
                    this.f15622e = 1;
                    obj = aVar.k(bArr, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                File file3 = (File) obj;
                if (file3 == null) {
                    return null;
                }
                try {
                    c7.a aVar2 = new c7.a(file3.getAbsolutePath());
                    Coordinates coordinates = this.f15626j;
                    aVar2.j0(coordinates.getLatitude(), coordinates.getLongitude());
                    aVar2.c0();
                    FileInputStream fileInputStreamA = io.sentry.instrumentation.file.h.b.a(new FileInputStream(file3), file3);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ar.a.b(fileInputStreamA, byteArrayOutputStream, 0, 2, null);
                    iy.a.e(a.this.base64Coder, byteArrayOutputStream.toByteArray(), null, 2, null);
                    file3.delete();
                } catch (IOException e15) {
                    file = file3;
                    e = e15;
                    try {
                        px.f.f163100a.d("Error occurred in addCoordinatesToBase64. Error message: " + e.getMessage(), e, px.c.a(p0Var));
                        if (file != null) {
                            vq.b.a(file.delete());
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        file2 = file;
                        if (file2 != null) {
                            vq.b.a(file2.delete());
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    file2 = file3;
                    th = th5;
                    if (file2 != null) {
                        vq.b.a(file2.delete());
                    }
                    throw th;
                }
                return null;
            } catch (IOException e16) {
                e = e16;
                file = null;
            } catch (Throwable th6) {
                th = th6;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super String> eVar) {
            return ((C0366a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            C0366a c0366a = a.this.new C0366a(this.f15625h, this.f15626j, eVar);
            c0366a.f15623f = obj;
            return c0366a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)[B"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super byte[]>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f15628f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ byte[] f15630h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f15631j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(byte[] bArr, Map<String, String> map, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f15630h = bArr;
            this.f15631j = map;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            File file;
            p0 p0Var = (p0) this.f15628f;
            Object objE = uq.b.e();
            int i15 = this.f15627e;
            File file2 = null;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    az.f fVar = a.this.fileManager;
                    this.f15628f = p0Var;
                    this.f15627e = 1;
                    obj = fVar.g(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                File file3 = (File) ((dx.i) obj).a();
                try {
                    if (file3 == null) {
                        return this.f15630h;
                    }
                    ar.d.f(file3, this.f15630h);
                    c7.a aVar = new c7.a(file3.getAbsolutePath());
                    for (Map.Entry<String, String> entry : this.f15631j.entrySet()) {
                        aVar.h0(entry.getKey(), entry.getValue());
                        aVar.c0();
                    }
                    byte[] bArrC = ar.d.c(file3);
                    file3.delete();
                    return bArrC;
                } catch (IOException e15) {
                    file = file3;
                    e = e15;
                    try {
                        px.f.f163100a.d("Error occurred in addExifAttributesByTags. Error message: " + e.getMessage(), e, px.c.a(p0Var));
                        if (file != null) {
                            vq.b.a(file.delete());
                        }
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                        file2 = file;
                        if (file2 != null) {
                            vq.b.a(file2.delete());
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    file2 = file3;
                    th = th5;
                    if (file2 != null) {
                        vq.b.a(file2.delete());
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                file = null;
            } catch (Throwable th6) {
                th = th6;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super byte[]> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = a.this.new b(this.f15630h, this.f15631j, eVar);
            bVar.f15628f = obj;
            return bVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f15633e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f15635g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f15633e = obj;
            this.f15635g |= PKIFailureInfo.systemUnavail;
            return a.this.k(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "", "<anonymous>", "(Lju/p0;)Ljava/util/Map;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super Map<String, ? extends String>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f15637f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f15639h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<xx.b> f15640j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, List<? extends xx.b> list, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f15639h = str;
            this.f15640j = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f15637f;
            uq.b.e();
            if (this.f15636e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            InputStream inputStreamOpenInputStream = a.this.context.getContentResolver().openInputStream(Uri.parse(this.f15639h));
            List<xx.b> list = this.f15640j;
            ArrayList<String> arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                pq.v.D(arrayList, b00.b.a((xx.b) it.next()));
            }
            LinkedHashMap linkedHashMap = null;
            try {
                if (inputStreamOpenInputStream != null) {
                    try {
                        c7.a aVar = new c7.a(inputStreamOpenInputStream);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(arrayList, 10)), 16));
                        for (String str : arrayList) {
                            oq.r rVarA = y.a(str, aVar.k(str));
                            linkedHashMap2.put(rVarA.c(), rVarA.d());
                        }
                        ar.b.a(inputStreamOpenInputStream, null);
                        linkedHashMap = linkedHashMap2;
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            ar.b.a(inputStreamOpenInputStream, th4);
                            throw th5;
                        }
                    }
                }
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                return linkedHashMap;
            } catch (IOException e15) {
                px.f.f163100a.d("Error occurred in getExifAttributesByTags. Error message: " + e15.getMessage(), e15, px.c.a(p0Var));
                return null;
            } finally {
                inputStreamOpenInputStream.close();
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Map<String, String>> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = a.this.new d(this.f15639h, this.f15640j, eVar);
            dVar.f15637f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lvy/c;", "<anonymous>", "(Lju/p0;)Lvy/c;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super Coordinates>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f15642f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f15644h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f15644h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            double[] dArrQ;
            p0 p0Var = (p0) this.f15642f;
            uq.b.e();
            if (this.f15641e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            InputStream inputStreamOpenInputStream = a.this.context.getContentResolver().openInputStream(Uri.parse(this.f15644h));
            try {
                c7.a aVar = inputStreamOpenInputStream != null ? new c7.a(inputStreamOpenInputStream) : null;
                if (aVar != null && (dArrQ = aVar.q()) != null) {
                    new Coordinates(dArrQ[0], dArrQ[1]);
                }
            } catch (IOException e15) {
                px.f.f163100a.d("Error occurred in getGPSCoordinates. Error message: " + e15.getMessage(), e15, px.c.a(p0Var));
                return null;
            } finally {
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            }
            return null;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Coordinates> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = a.this.new e(this.f15644h, eVar);
            eVar2.f15642f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lvy/c;", "<anonymous>", "(Lju/p0;)Lvy/c;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super Coordinates>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f15646f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ byte[] f15648h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(byte[] bArr, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f15648h = bArr;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            File file;
            p0 p0Var = (p0) this.f15646f;
            Object objE = uq.b.e();
            int i15 = this.f15645e;
            File file2 = null;
            coordinates = null;
            Coordinates coordinates = null;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    a aVar = a.this;
                    byte[] bArr = this.f15648h;
                    this.f15646f = p0Var;
                    this.f15645e = 1;
                    obj = aVar.k(bArr, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                File file3 = (File) obj;
                if (file3 == null) {
                    return null;
                }
                try {
                    double[] dArrQ = new c7.a(file3.getAbsolutePath()).q();
                    Double dW0 = dArrQ != null ? pq.n.w0(dArrQ, 0) : null;
                    Double dW1 = dArrQ != null ? pq.n.w0(dArrQ, 1) : null;
                    if (dW0 != null && dW1 != null) {
                        coordinates = new Coordinates(dW0.doubleValue(), dW1.doubleValue());
                    }
                    file3.delete();
                    return coordinates;
                } catch (IOException e15) {
                    file = file3;
                    e = e15;
                    try {
                        px.f.f163100a.d("Error occurred in getCoordinates. Error message: " + e.getMessage(), e, px.c.a(p0Var));
                        if (file != null) {
                            vq.b.a(file.delete());
                        }
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                        file2 = file;
                        if (file2 != null) {
                            vq.b.a(file2.delete());
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    file2 = file3;
                    th = th5;
                    if (file2 != null) {
                        vq.b.a(file2.delete());
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                file = null;
            } catch (Throwable th6) {
                th = th6;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Coordinates> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = a.this.new f(this.f15648h, eVar);
            fVar.f15646f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)I"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<p0, tq.e<? super Integer>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15649e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f15651g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f15651g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Integer numE;
            uq.b.e();
            if (this.f15649e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            InputStream inputStreamOpenInputStream = a.this.context.getContentResolver().openInputStream(Uri.parse(this.f15651g));
            if (inputStreamOpenInputStream == null) {
                px.f.e(px.f.f163100a, "InputStream is null", null, px.c.a(a.this), 2, null);
                return null;
            }
            try {
                int iM = new c7.a(inputStreamOpenInputStream).m("Orientation", 1);
                if (iM == 1) {
                    numE = vq.b.e(0);
                } else if (iM == 3) {
                    numE = vq.b.e(180);
                } else if (iM != 6) {
                    numE = iM != 8 ? null : vq.b.e(270);
                } else {
                    numE = vq.b.e(90);
                }
                ar.b.a(inputStreamOpenInputStream, null);
                return numE;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(inputStreamOpenInputStream, th4);
                    throw th5;
                }
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Integer> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new g(this.f15651g, eVar);
        }
    }

    public a(Context context, az.f fVar, iy.a aVar, xw.d dVar) {
        this.context = context;
        this.fileManager = fVar;
        this.base64Coder = aVar;
        this.dispatcherProvider = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(byte[] bArr, tq.e<? super File> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f15635g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f15635g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objG = cVar.f15633e;
        Object objE = uq.b.e();
        int i16 = cVar.f15635g;
        if (i16 == 0) {
            oq.u.b(objG);
            az.f fVar = this.fileManager;
            cVar.f15632d = bArr;
            cVar.f15635g = 1;
            objG = fVar.g(cVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) cVar.f15632d;
            oq.u.b(objG);
        }
        File file = (File) ((dx.i) objG).a();
        if (file == null) {
            return null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        FileOutputStream fileOutputStreamA = io.sentry.instrumentation.file.l.b.a(new FileOutputStream(file), file);
        try {
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStreamA);
            ar.b.a(fileOutputStreamA, null);
            return file;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ar.b.a(fileOutputStreamA, th4);
                throw th5;
            }
        }
    }

    @Override // xx.a
    public Object a(String str, Coordinates coordinates, tq.e<? super String> eVar) {
        return this.dispatcherProvider.a(new C0366a(str, coordinates, null), eVar);
    }

    @Override // xx.a
    public Object b(String str, tq.e<? super Integer> eVar) {
        return this.dispatcherProvider.a(new g(str, null), eVar);
    }

    @Override // xx.a
    public Object c(byte[] bArr, Map<String, String> map, tq.e<? super byte[]> eVar) {
        return this.dispatcherProvider.a(new b(bArr, map, null), eVar);
    }

    @Override // xx.a
    public Object d(String str, tq.e<? super Coordinates> eVar) {
        return this.dispatcherProvider.a(new e(str, null), eVar);
    }

    @Override // xx.a
    public Object e(String str, List<? extends xx.b> list, tq.e<? super Map<String, String>> eVar) {
        return this.dispatcherProvider.a(new d(str, list, null), eVar);
    }

    @Override // xx.a
    public Object f(byte[] bArr, tq.e<? super Coordinates> eVar) {
        return this.dispatcherProvider.a(new f(bArr, null), eVar);
    }
}
