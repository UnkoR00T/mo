package kl2;

import a14.a0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lkl2/a;", "", "<init>", "()V", "Lll2/a;", "e", "()Lll2/a;", "Luq0/b;", "downloadKRSDocument", "La14/a0;", "saveFilesOnDeviceUseCase", "Laz/d;", "fileConverter", "Lml2/b;", "generatePdfNameUC", "Lmx/c;", "labelProvider", "Lml2/a;", "a", "(Luq0/b;La14/a0;Laz/d;Lml2/b;Lmx/c;)Lml2/a;", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "b", "(Lez/e;Lez/a;)Lml2/b;", "subscriptionRepository", "Lml2/c;", "c", "(Lll2/a;)Lml2/c;", "Luq0/a;", "createSubscriptionUC", "Luq0/c;", "editSubscriptionUC", "Lml2/f;", "d", "(Luq0/a;Luq0/c;Lll2/a;)Lml2/f;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final ml2.a a(uq0.b downloadKRSDocument, a0 saveFilesOnDeviceUseCase, az.d fileConverter, ml2.b generatePdfNameUC, mx.c labelProvider) {
        return new ml2.a(downloadKRSDocument, saveFilesOnDeviceUseCase, fileConverter, generatePdfNameUC, labelProvider);
    }

    public final ml2.b b(ez.e dateFormatter, ez.a currentTimeProvider) {
        return new ml2.b(dateFormatter, currentTimeProvider);
    }

    public final ml2.c c(ll2.a subscriptionRepository) {
        return new ml2.c(subscriptionRepository);
    }

    public final ml2.f d(uq0.a createSubscriptionUC, uq0.c editSubscriptionUC, ll2.a subscriptionRepository) {
        return new ml2.f(createSubscriptionUC, editSubscriptionUC, subscriptionRepository);
    }

    public final ll2.a e() {
        return new jl2.a();
    }
}
