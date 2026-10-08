package p1;

import android.view.textclassifier.TextClassification;
import er.l;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import q1.TextContextMenuItem;
import q1.TextContextMenuRemoteActionItem;
import q1.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u0010\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lp1/a;", "", "key", "", AnnotatedPrivateKey.LABEL, "", "leadingIcon", "Lkotlin/Function1;", "Lq1/g;", "Loq/i0;", "onClick", "a", "(Lp1/a;Ljava/lang/Object;Ljava/lang/String;ILer/l;)V", "Landroid/view/textclassifier/TextClassification;", "textClassification", "index", "c", "(Lp1/a;Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final void a(a aVar, Object obj, String str, int i15, l<? super g, i0> lVar) {
        aVar.a(new TextContextMenuItem(obj, str, i15, lVar));
    }

    public static /* synthetic */ void b(a aVar, Object obj, String str, int i15, l lVar, int i16, Object obj2) {
        if ((i16 & 4) != 0) {
            i15 = 0;
        }
        a(aVar, obj, str, i15, lVar);
    }

    public static final void c(a aVar, Object obj, TextClassification textClassification, int i15) {
        aVar.a(new TextContextMenuRemoteActionItem(obj, textClassification, i15));
    }
}
