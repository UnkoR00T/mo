package jv1;

import a14.a0;
import mz3.q;
import mz3.s;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\nH\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020(H\u0007¢\u0006\u0004\b-\u0010.J'\u00106\u001a\u0002052\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Ljv1/a;", "", "<init>", "()V", "Lez/e;", "dateFormatter", "Lvv1/a;", "documentRemoteResourcesMapper", "Lay/i;", "jsonFieldParser", "Lev1/a;", "c", "(Lez/e;Lvv1/a;Lay/i;)Lev1/a;", "Lmx/c;", "labelProvider", "Lkv1/a;", "dynamicDocumentContainersInteractor", "Lpv1/c;", "e", "(Lmx/c;Lkv1/a;)Lpv1/c;", "Lpv1/a;", "d", "(Lkv1/a;Lmx/c;)Lpv1/a;", "Lmz3/s;", "monitorDocumentsDownloadStatusUC", "getByIdDynamicDocumentsListDataUC", "Lpv1/f;", "getDynamicListSingleDocumentStatusUC", "Lxw/d;", "dispatcherProvider", "Lpv1/h;", "g", "(Lmz3/s;Lkv1/a;Lpv1/c;Lpv1/f;Lxw/d;)Lpv1/h;", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "Lpx/d;", "remoteLogger", "f", "(Lkv1/a;Lmz3/q;Lpx/d;)Lpv1/f;", "dynamicDecoder", "Ltv1/e;", "h", "(Lev1/a;)Ltv1/e;", "decoder", "Lyv1/d;", "b", "(Ltv1/e;)Lyv1/d;", "Lgv0/a;", "beDownloadDiplomaUC", "La14/a0;", "saveFilesOnDeviceUseCase", "Laz/d;", "fileConverter", "Lov1/a;", "a", "(Lgv0/a;La14/a0;Laz/d;)Lov1/a;", "Lvv1/g;", "i", "(Lmx/c;)Lvv1/g;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final ov1.a a(gv0.a beDownloadDiplomaUC, a0 saveFilesOnDeviceUseCase, az.d fileConverter) {
        return new ov1.b(beDownloadDiplomaUC, saveFilesOnDeviceUseCase, fileConverter);
    }

    public final yv1.d b(tv1.e decoder) {
        return new yv1.d(decoder);
    }

    public final ev1.a c(ez.e dateFormatter, vv1.a documentRemoteResourcesMapper, ay.i jsonFieldParser) {
        return new tv1.d(dateFormatter, documentRemoteResourcesMapper, jsonFieldParser);
    }

    public final pv1.a d(kv1.a dynamicDocumentContainersInteractor, mx.c labelProvider) {
        return new pv1.b(dynamicDocumentContainersInteractor, labelProvider);
    }

    public final pv1.c e(mx.c labelProvider, kv1.a dynamicDocumentContainersInteractor) {
        return new pv1.d(dynamicDocumentContainersInteractor, labelProvider);
    }

    public final pv1.f f(kv1.a dynamicDocumentContainersInteractor, q getDocumentDownloadStatusUseCase, px.d remoteLogger) {
        return new pv1.g(dynamicDocumentContainersInteractor, getDocumentDownloadStatusUseCase, remoteLogger);
    }

    public final pv1.h g(s monitorDocumentsDownloadStatusUC, kv1.a dynamicDocumentContainersInteractor, pv1.c getByIdDynamicDocumentsListDataUC, pv1.f getDynamicListSingleDocumentStatusUC, xw.d dispatcherProvider) {
        return new pv1.i(monitorDocumentsDownloadStatusUC, dynamicDocumentContainersInteractor, getByIdDynamicDocumentsListDataUC, getDynamicListSingleDocumentStatusUC, dispatcherProvider);
    }

    public final tv1.e h(ev1.a dynamicDecoder) {
        return new tv1.f(dynamicDecoder);
    }

    public final vv1.g i(mx.c labelProvider) {
        return new vv1.h(labelProvider);
    }
}
