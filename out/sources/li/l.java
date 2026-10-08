package li;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.n41;
import com.google.android.libraries.places.internal.y41;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends RecyclerView.f0 {
    private boolean A;
    private final ForegroundColorSpan B;
    private final ForegroundColorSpan C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final TextView f118329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TextView f118330v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ImageView f118331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final FrameLayout f118332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final y41 f118333y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ii.h f118334z;

    public l(final k kVar, View view, y41 y41Var) {
        super(view);
        this.B = new ForegroundColorSpan(bj.a.d(view, fi.a.f64016r));
        this.C = new ForegroundColorSpan(bj.a.d(view, fi.a.f64015q));
        this.f118329u = (TextView) view.findViewById(fi.e.f64064n);
        this.f118330v = (TextView) view.findViewById(fi.e.f64066o);
        this.f118331w = (ImageView) view.findViewById(fi.e.f64073u);
        this.f118332x = (FrameLayout) view.findViewById(fi.e.f64074v);
        this.f118333y = y41Var;
        this.f13091a.setOnClickListener(new View.OnClickListener() { // from class: li.j
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                this.f118327a.Q(kVar, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void Q(k kVar, View view) {
        ii.h hVar = this.f118334z;
        if (hVar == null) {
            return;
        }
        try {
            kVar.a(hVar, k());
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    public final void O(ii.h hVar, boolean z15) {
        String strConcat;
        this.f118334z = hVar;
        this.A = z15;
        pi.c cVarO = this.f118333y.o();
        if (cVarO != null) {
            pi.d f157899c = cVarO.getF157899c();
            if (f157899c != null) {
                int f157904a = f157899c.getF157904a();
                if (f157904a != 0) {
                    this.f118332x.setVisibility(0);
                    this.f118331w.setImageResource(f157904a);
                } else {
                    this.f118332x.setVisibility(8);
                }
            }
            pi.b f157897a = cVarO.getF157897a();
            if (f157897a != null && f157897a.ordinal() == 1) {
                this.f118329u.setSingleLine(false);
                this.f118330v.setSingleLine(false);
            }
        }
        this.f118329u.setText(hVar.d(this.B));
        SpannableString spannableStringE = hVar.e(null);
        Integer numB = this.f118334z.b();
        if (numB == null) {
            strConcat = "";
        } else {
            double dIntValue = ((double) numB.intValue()) * 6.21371E-4d;
            if (dIntValue % 1.0d == 0.0d) {
                int i15 = (int) dIntValue;
                StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 3);
                sb5.append(i15);
                sb5.append(" mi");
                strConcat = sb5.toString();
            } else {
                strConcat = String.valueOf(new DecimalFormat("#.#").format(dIntValue)).concat(" mi");
            }
        }
        TextView textView = this.f118330v;
        textView.setVisibility(0);
        if (spannableStringE.length() == 0 || strConcat.length() == 0) {
            if (strConcat.length() != 0) {
                textView.setText(strConcat);
                return;
            } else if (spannableStringE.length() != 0) {
                textView.setText(spannableStringE);
                return;
            } else {
                textView.setVisibility(8);
                return;
            }
        }
        String strValueOf = String.valueOf(spannableStringE);
        StringBuilder sb6 = new StringBuilder(strConcat.length() + 5 + strValueOf.length());
        sb6.append(strConcat);
        sb6.append("  ·  ");
        sb6.append(strValueOf);
        SpannableString spannableString = new SpannableString(sb6.toString());
        int length = strConcat.length();
        spannableString.setSpan(this.C, length + 2, length + 3, 33);
        textView.setText(spannableString);
    }

    public final boolean P() {
        return this.A;
    }
}
