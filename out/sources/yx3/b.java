package yx3;

import d40.j;
import mx.Label;
import p071kotlin.Metadata;
import p076m2.r;
import vr0.BEUserCard;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lyx3/b;", "", "Lvr0/p;", "card", "Lmx/a;", "b", "(Lvr0/p;)Lmx/a;", "", "d", "(Lvr0/p;)I", "Landroidx/compose/ui/graphics/Color;", "e", "(Lvr0/p;Lm2/r;I)J", "Ld40/j;", "a", "(Lvr0/p;)Ld40/j;", "", "cardNumber", "c", "(Ljava/lang/String;)Lmx/a;", "f", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    j a(BEUserCard card);

    Label b(BEUserCard card);

    Label c(String cardNumber);

    int d(BEUserCard card);

    long e(BEUserCard bEUserCard, r rVar, int i15);

    Label f(String cardNumber);
}
