package me.akhilarimbra.devslopesradio.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import me.akhilarimbra.devslopesradio.R;
import me.akhilarimbra.devslopesradio.model.Station;

/**
 * Created by akhilraj on 29/10/16.
 */

public class StationViewHolder extends RecyclerView.ViewHolder {
    private ImageView mainImage;
    private TextView mainTextView;

    public StationViewHolder(View itemView) {
        super(itemView);

        this.mainImage = (ImageView) itemView.findViewById(R.id.main_image);
        this.mainTextView = (TextView) itemView.findViewById(R.id.main_text);
    }

    public void updateUI(Station station) {
        String uri = station.getImageURI();
        int resource = mainImage.getResources().getIdentifier(uri, null, mainImage.getContext().getPackageName());
        mainImage.setImageResource(resource);

        mainTextView.setText(station.getStationTitle());
    }
}
