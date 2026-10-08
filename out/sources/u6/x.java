package u6;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000eB9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu6/x;", "T", "Lu6/q0;", "Lu6/l0;", "serializer", "Lkotlin/Function1;", "Ljava/io/File;", "Lu6/d0;", "coordinatorProducer", "Lkotlin/Function0;", "produceFile", "<init>", "(Lu6/l0;Ler/l;Ler/a;)V", "Lu6/r0;", "a", "()Lu6/r0;", "Lu6/l0;", "b", "Ler/l;", "c", "Ler/a;", "d", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x<T> implements q0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<String> f195752e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f195753f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l0<T> serializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.l<File, d0> coordinatorProducer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.a<File> produceFile;

    /* JADX WARN: Multi-variable type inference failed */
    public x(l0<T> l0Var, er.l<? super File, ? extends d0> lVar, er.a<? extends File> aVar) {
        this.serializer = l0Var;
        this.coordinatorProducer = lVar;
        this.produceFile = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 d(File file) {
        return f0.a(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(File file) {
        synchronized (f195753f) {
            f195752e.remove(file.getAbsolutePath());
        }
        return oq.i0.f148189a;
    }

    @Override // u6.q0
    public r0<T> a() throws IOException {
        final File canonicalFile = this.produceFile.a().getCanonicalFile();
        synchronized (f195753f) {
            String absolutePath = canonicalFile.getAbsolutePath();
            Set<String> set = f195752e;
            if (set.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(absolutePath);
        }
        return new y(canonicalFile, this.serializer, this.coordinatorProducer.b(canonicalFile), new er.a() { // from class: u6.w
            @Override // er.a
            public final Object a() {
                return x.e(canonicalFile);
            }
        });
    }

    public /* synthetic */ x(l0 l0Var, er.l lVar, er.a aVar, int i15, fr.k kVar) {
        this(l0Var, (i15 & 2) != 0 ? new er.l() { // from class: u6.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.d((File) obj);
            }
        } : lVar, aVar);
    }
}
