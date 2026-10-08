package li;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.n41;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.f0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final TextView f118318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TextView f118319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ii.h f118320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f118321x;

    public g(final e eVar, View view) {
        super(view);
        this.f118318u = (TextView) view.findViewById(fi.e.J);
        this.f118319v = (TextView) view.findViewById(fi.e.K);
        this.f13091a.setOnClickListener(new View.OnClickListener() { // from class: li.f
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                this.f118316a.Q(eVar, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void Q(e eVar, View view) {
        ii.h hVar = this.f118320w;
        if (hVar == null) {
            return;
        }
        try {
            eVar.a(hVar, k());
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    public final void O(ii.h hVar, boolean z15) {
        this.f118320w = hVar;
        this.f118321x = z15;
        SpannableString spannableStringD = hVar.d(new ForegroundColorSpan(u5.a.d(this.f13091a.getContext(), fi.b.f64028d)));
        TextView textView = this.f118318u;
        textView.setText(spannableStringD);
        TextView textView2 = this.f118319v;
        SpannableString spannableStringE = hVar.e(null);
        textView2.setText(spannableStringE);
        if (spannableStringE.length() == 0) {
            textView2.setVisibility(8);
            textView.setGravity(16);
        } else {
            textView2.setVisibility(0);
            textView.setGravity(80);
        }
    }

    public final boolean P() {
        return this.f118321x;
    }
}
