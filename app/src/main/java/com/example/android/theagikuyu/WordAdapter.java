package com.example.android.theagikuyu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param words A List of Word objects to display in a list

     */
    public WordAdapter(Context context, ArrayList<Word> words)  {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listview_activity, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID imageResourceId
        ImageView image =  listItemView.findViewById(R.id.listview_image);
        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            image.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            image.setVisibility(View.GONE);
        }



        // Find the TextView in the list_item.xml layout with the ID defaultTranslation
        TextView nameTextView =listItemView.findViewById(R.id.listview_item_title);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getKikuyuTranslation());
        // Find the TextView in the list_item.xml layout with the ID defaultTranslation
        TextView detailsTextView =listItemView.findViewById(R.id.listview_item_short_description);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        detailsTextView.setText(currentWord.getDefaultTranslation());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}