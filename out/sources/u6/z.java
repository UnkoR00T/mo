package u6;

import java.io.File;
import java.io.IOException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0082@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Ljava/io/File;", "file", "Lkotlin/Function1;", "Ltq/e;", "", "block", "b", "(Ljava/io/File;Ler/l;Ltq/e;)Ljava/lang/Object;", "datastore-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class z {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f195775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195776f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195775e = obj;
            this.f195776f |= PKIFailureInfo.systemUnavail;
            return z.b(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object b(File file, er.l<? super tq.e<? super T>, ? extends Object> lVar, tq.e<? super T> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f195776f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f195776f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f195775e;
        Object objE = uq.b.e();
        int i16 = aVar.f195776f;
        try {
            if (i16 != 0) {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            aVar.f195774d = file;
            aVar.f195776f = 1;
            Object objB = lVar.b(aVar);
            return objB == objE ? objE : objB;
        } catch (IOException e15) {
            if (e15 instanceof d) {
                throw e15;
            }
            throw s.f195734a.a(file, e15);
        }
    }
}
